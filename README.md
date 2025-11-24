# Exercício – Padrão Adapter (Adaptador)

Este repositório contém um exercício prático para aplicar o **Padrão de Projeto Adapter** em Java.  
O objetivo é adaptar uma biblioteca antiga de áudio (`BibliotecaAudioAntiga`) para que ela possa ser usada por um sistema moderno (`MeuAppDeMusica`) sem alterar o código da biblioteca.

---

## 🎯 Objetivo
Permitir que o sistema "MeuAppDeMusica" execute áudio utilizando uma biblioteca antiga que tem métodos incompatíveis com a interface esperada.

---

## 🧩 O Problema
A biblioteca antiga possui métodos com nomes diferentes:

```java
public class BibliotecaAudioAntiga {
    public void iniciarAudio() {
        System.out.println("Biblioteca Antiga: Começando o áudio...");
    }

    public void finalizarAudio() {
        System.out.println("Biblioteca Antiga: Terminando o áudio...");
    }
}
