/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.client.utils;

import java.net.MalformedURLException;
import java.net.URL;

import com.openshift.client.cartridge.EmbeddableCartridge;
import com.openshift.client.cartridge.IEmbeddableCartridge;
import com.openshift.client.cartridge.IStandaloneCartridge;
import com.openshift.client.cartridge.StandaloneCartridge;

/**
 * @author Andre Dietisheim
 */
public class Cartridges {

	public static final String JBOSSAS_7_NAME = "jbossas-7";
	public static final String JBOSSEAP_6_NAME = "jbosseap-6";
	public static final String NODEJS_06_NAME = "nodejs-0.6";
	public static final String JBOSSEWS_1_NAME = "jbossews-1.0";
	public static final String JBOSSEWS_2_NAME = "jbossews-2.0";
	public static final String JENKINS_14_NAME = "jenkins-1.4";
	public static final String GO_DOWNLOAD_URL =
			"http://cartreflect-claytondev.rhcloud.com/reflect?github=smarterclayton/openshift-go-cart";

	public static final String MYSQL_51_NAME = "mysql-5.1";
	public static final String MONGODB_22_NAME = "mongodb-2.2";
	public static final String FOREMAN_DOWNLOAD_URL =
			"http://cartreflect-claytondev.rhcloud.com/reflect?github=ncdc/openshift-foreman-cartridge";
	public static final String SWITCHYARD_06_NAME = "switchyard-0.6";
	public static final String POSTGRESQL_84_NAME = "postgresql-8.4";
	public static final String HAPROXY_14_NAME = "haproxy-1.4";


	public static IStandaloneCartridge as7() {
		return new StandaloneCartridge(JBOSSAS_7_NAME);
	}
	
	public static IStandaloneCartridge eap6() {
		return new StandaloneCartridge(JBOSSEAP_6_NAME);
	}

	public static IStandaloneCartridge ews1() {
		return new StandaloneCartridge(JBOSSEWS_1_NAME);
	}

	public static IStandaloneCartridge ews2() {
		return new StandaloneCartridge(JBOSSEWS_2_NAME);
	}

	public static IStandaloneCartridge jenkins14() {
		return new StandaloneCartridge(JENKINS_14_NAME);
	}

	public static IStandaloneCartridge go11() throws MalformedURLException {
		return new StandaloneCartridge(null, new URL(GO_DOWNLOAD_URL));
	}

	public static IEmbeddableCartridge mysql51() {
		return new EmbeddableCartridge(MYSQL_51_NAME);
	}

	public static IEmbeddableCartridge mongodb22() {
		return new EmbeddableCartridge(MONGODB_22_NAME);
	}

	public static IEmbeddableCartridge postgres84() {
		return new EmbeddableCartridge(POSTGRESQL_84_NAME);
	}

	public static IEmbeddableCartridge switchyard06() {
		return new EmbeddableCartridge(SWITCHYARD_06_NAME);
	}

	public static IEmbeddableCartridge haproxy14() {
		return new EmbeddableCartridge(HAPROXY_14_NAME);
	}

	public static IEmbeddableCartridge foreman063() throws MalformedURLException {
		return new EmbeddableCartridge("andygoldstein-foreman-0.63.0", new URL(FOREMAN_DOWNLOAD_URL));
	}
	
}
