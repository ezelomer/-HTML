/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

/**
 *
 * @author jhonn
 */
public class Proyecto {

 

public class SpeechRecognition {
    public static void main(String[] args) {
        try {
            // Configuración del reconocimiento de voz
            Configuration configuration = new Configuration();
            
            // Configura el modelo acústico, el modelo del lenguaje y el diccionario
            configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
            configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
            configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
            
            // Crea el reconocedor de voz en vivo
            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
            
            System.out.println("Iniciando reconocimiento de voz...");
            
            // Empieza a escuchar y reconoce la voz
            while (true) {
                SpeechResult result = recognizer.getResult();
                System.out.println("Reconocido: " + result.getHypothesis());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


    
    
}
