package br.com.alura.screensound.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class ConsultaArtista {
    public static String obterInformacao(String nomeArtista) {
        String url = "https://pt.wikipedia.org/wiki/" + nomeArtista.replace(" ", "_");

        try {
            Document doc = Jsoup.connect(url).get();

            Element paragrafo = doc.select("p").first();

            if (paragrafo != null) {
                return paragrafo.text();
            } else {
                return "Informações não encontradas para o artista: " + nomeArtista;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Erro ao buscar informações";
        }
    }
}
