package br.com.zup.cliente.entity;

import java.util.List;

public class MarvelComicDataResponse {

	private List<ComicMarvel> results;

	public List<ComicMarvel> getResults() {
		return results;
	}

	public void setResults(List<ComicMarvel> results) {
		this.results = results;
	}

}