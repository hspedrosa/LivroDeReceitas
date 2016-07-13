<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:p="http://primefaces.org/ui">
<h:head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Livro de Receitas</title>
</h:head>
<h:body>
<h:form id="form">
             
    <p:growl id="msgs" showDetail="true" />
 
    <h3 style="margin-top:0">Basic</h3>
    <p:tabView>
        <p:tab title="Godfather Part I">
            <h:panelGrid columns="2" cellpadding="10">
                <p:graphicImage name="demo/images/godfather/godfather1.jpg" />
                <h:outputText
                    value="The story begins as Don Vito Corleone..." />
            </h:panelGrid>
        </p:tab>
        <p:tab title="Godfather Part II">
            <h:panelGrid columns="2" cellpadding="10">
                <p:graphicImage name="demo/images/godfather/godfather2.jpg" />
                <h:outputText value="Francis Ford Coppola's legendary..." />
            </h:panelGrid>
        </p:tab>
        <p:tab title="Godfather Part III">
            <h:panelGrid columns="2" cellpadding="10">
                <p:graphicImage name="demo/images/godfather/godfather3.jpg" />
                <h:outputText value="After a break of more than 15 years..." />
            </h:panelGrid>
        </p:tab>
    </p:tabView>
    </h:form>
    </h:body>
</html>