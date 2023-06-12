import java.util.Arrays;
import java.util.Random;

public class NN {

    private final int featuresize;
    private final int hiddenSize;
    private final int outputSize;
    private double[][] weights1;
    private double[][] weights2;
    private double[] hiddenLayer;
    private double[] outputLayer;
    private double[] hiddenLayerError;
    private double[] outputLayerError;
    private final double learningRate;

    public NN(int featuresize, int hiddenSize, int outputSize, double learningRate) {
        this.featuresize = featuresize;
        this.hiddenSize = hiddenSize;
        this.outputSize = outputSize;
        this.learningRate = learningRate;

        Random random = new Random();
        weights1 = new double[featuresize][hiddenSize];
        weights2 = new double[hiddenSize][outputSize];
        for (int i = 0; i < featuresize; i++) {
            for (int j = 0; j < hiddenSize; j++) {
                weights1[i][j] = random.nextDouble() - 0.5;
            }
        }
        for (int i = 0; i < hiddenSize; i++) {
            for (int j = 0; j < outputSize; j++) {
                weights2[i][j] = random.nextDouble() - 0.5;
            }
        }

        hiddenLayer = new double[hiddenSize];
        outputLayer = new double[outputSize];
        hiddenLayerError = new double[hiddenSize];
        outputLayerError = new double[outputSize];
    }

    public double[] feedForward(double[] input) {
        for (int i = 0; i < hiddenSize; i++) {
            double sum = 0;
            for (int j = 0; j < featuresize; j++) {
                sum += input[j] * weights1[j][i];
            }
            hiddenLayer[i] = sigmoid(sum);
        }

        for (int i = 0; i < outputSize; i++) {
            double sum = 0;
            for (int j = 0; j < hiddenSize; j++) {
                sum += hiddenLayer[j] * weights2[j][i];
            }
            outputLayer[i] = sigmoid(sum);
        }

        return outputLayer;
    }

    public void train(double[] input, double[] target) {
        double[] output = feedForward(input);

        for (int i = 0; i < outputSize; i++) {
            outputLayerError[i] = (target[i] - output[i]) * sigmoidDerivative(output[i]);
        }

        for (int i = 0; i < hiddenSize; i++) {
            double sum = 0;
            for (int j = 0; j < outputSize; j++) {
                sum += weights2[i][j] * outputLayerError[j];
            }
            hiddenLayerError[i] = sum * sigmoidDerivative(hiddenLayer[i]);
        }

        for (int i = 0; i < featuresize; i++) {
            for (int j = 0; j < hiddenSize; j++) {
                weights1[i][j] += learningRate * input[i] * hiddenLayerError[j];
            }
        }
        for (int i = 0; i < hiddenSize; i++) {
            for (int j = 0; j < outputSize; j++) {
                weights2[i][j] += learningRate * hiddenLayer[i] * outputLayerError[j];
            }
        }
    }

    private double sigmoid(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }

    private double sigmoidDerivative(double x) {
        double sigmoid = sigmoid(x);
        return sigmoid * (1.0 - sigmoid);
    }

    public static void main(String[] args) {
        NN neuralNetwork = new NN(2, 2, 1, 0.1);
        double[][] features = {{0, 0}, {0, 1}, {1, 0}, {1, 1}, {0,2}, {2,0}, {2,1}};
        double[][] labels = {{0}, {0}, {1}, {1}, {0}, {0}, {0}};
        for (int epoch = 0; epoch < 10000; epoch++) {
            for (int i = 0; i < features.length; i++) {
                neuralNetwork.train(features[i], labels[i]);
            }
        }
        double[][] test = {{2, 8}, {0, 1}, {1, 0}, {1, 1}, {0,2}, {0,5}, {0,8}};
        for (int i = 0; i < test.length; i++) {
            double[] input = test[i];
            double[] output = neuralNetwork.feedForward(input);
            System.out.println("Input: " + Arrays.toString(input) + ", Output: " + Arrays.toString(output));
        }
    }
}
