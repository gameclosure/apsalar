<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:android="http://schemas.android.com/apk/res/android">

	<xsl:param name="apsalarKey" />
	<xsl:param name="apsalarSecret" />
	<xsl:param name="apsalarFacebook" />

	<xsl:output indent="yes" />
	<xsl:template match="comment()" />

	<xsl:template match="meta-data[@android:name='APSALAR_KEY']">
		<meta-data android:name="APSALAR_KEY" android:value="{$apsalarKey}"/>
	</xsl:template>

	<xsl:template match="meta-data[@android:name='APSALAR_SECRET']">
		<meta-data android:name="APSALAR_SECRET" android:value="{$apsalarSecret}"/>
	</xsl:template>

	<xsl:template match="meta-data[@android:name='APSALAR_FACEBOOK']">
		<meta-data android:name="APSALAR_FACEBOOK" android:value="{$apsalarFacebook}"/>
	</xsl:template>

	<xsl:output indent="yes" />
	<xsl:template match="comment()" />

	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
</xsl:stylesheet>
