package br.com.alura.loja.orcamento.adapter.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            final URL urlApi = new URL(url);
            final URLConnection urlConnection = urlApi.openConnection();
            urlConnection.connect();

        } catch (Exception e) {

            throw new RuntimeException(e);
        }

    }
}
