public class AudioAdapter implements Player {

    private BibliotecaAudioAntiga biblioteca;

    public AudioAdapter(BibliotecaAudioAntiga biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void play() {
        biblioteca.iniciarAudio();
    }

    @Override
    public void stop() {
        biblioteca.finalizarAudio();
    }
}
