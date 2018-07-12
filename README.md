Marketplace simulation example
==============================

This project is composed of three Maven projects:

 - **everis-components** this base project is for common plugins and ui-bundles, to share among different
 projects.
 This projects contains a simple hello world plugin and no bundles. If bundles were
 present they would  contain only fallbacks or general inclusion of technology stuff (e.g. Bootstrap, JQuery etc etc)

 - **everis-ui-bundle-1** this repository contains no plugins (but it could if needed) but a 
ui-bundle for the generic product 1 line.
Using this template would also import automatically the plugin from the everis-component container.
This template would introduce in the target Entando webapp a new page model called *everis-product-one-theme*

 - **everis-ui-bundle-2** contains a different version of the template, suitable for the generic product 2 line.
Again, the business logic is the same - the hello world plugin is automatically imported - but the bundle available in this repository, *everis-product-two-theme* , is slightly different.


To install the bundle for the product line 1 add the following snippet in the target
Entando POM.XML file

	<dependency>
		<artifactId>everis-product-one-theme</artifactId>
		<groupId>es.everis.entando.bundles.pages</groupId>
		<version>${entando.version}</version>
		<type>war</type>
	</dependency>
	
otherwise use the *everis-product-two-theme* artifactId

Installation order
==================

The first project to install is the **everis-components** project, followed by the remainig two in any order 
