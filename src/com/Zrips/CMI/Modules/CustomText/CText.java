package com.Zrips.CMI.Modules.CustomText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class CText {

    private HashMap<Integer, List<String>> pages = new HashMap<Integer, List<String>>();
    private String name;
    private boolean autoPage = true;
    private boolean autoAlias = true;
    private boolean requirePermission = false;

    public CText(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public int getTotalPages() {
	return pages.size();
    }

    public void setName(String name) {
	this.name = name;
    }

    public HashMap<Integer, List<String>> getPages() {
	return pages;
    }

    public List<String> getPage(Integer page) {
	return this.pages.get(page);
    }

    public void setPages(HashMap<Integer, List<String>> pages) {
	this.pages = pages;
    }

    public void addPage(Integer page, List<String> lines) {
	this.pages.put(page, lines);
    }

    public void removePage(int page) {
    }

    public void removeLine(Integer page, int lineNr) {
    }

    public void replaceLine(Integer page, Integer lineNr, String line) {
    }

    public void addLine(Integer page, String line) {
    }

    public boolean isAutoPage() {
	return autoPage;
    }

    public void setAutoPage(boolean autoPage) {
	this.autoPage = autoPage;
    }

    public boolean isAutoAlias() {
	return autoAlias;
    }

    public void setAutoAlias(boolean autoAlias) {
	this.autoAlias = autoAlias;
    }

    public boolean isRequirePermission() {
	return requirePermission;
    }

    public void setRequirePermission(boolean requirePermission) {
	this.requirePermission = requirePermission;
    }

}