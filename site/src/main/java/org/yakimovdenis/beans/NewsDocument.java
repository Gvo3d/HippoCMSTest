package org.yakimovdenis.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.yakimovdenis.beans.Imageset;

@HippoEssentialsGenerated(internalName = "HippoCMSTest:newsdocument")
@Node(jcrType = "HippoCMSTest:newsdocument")
public class NewsDocument extends HippoDocument {
    /** 
     * The document type of the news document.
     */
    public final static String DOCUMENT_TYPE = "HippoCMSTest:newsdocument";
    private final static String TITLE = "HippoCMSTest:title";
    private final static String DATE = "HippoCMSTest:date";
    private final static String INTRODUCTION = "HippoCMSTest:introduction";
    private final static String IMAGE = "HippoCMSTest:image";
    private final static String CONTENT = "HippoCMSTest:content";
    private final static String LOCATION = "HippoCMSTest:location";
    private final static String AUTHOR = "HippoCMSTest:author";
    private final static String SOURCE = "HippoCMSTest:source";

    /** 
     * Get the title of the document.
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    /** 
     * Get the date of the document.
     * @return the date
     */
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:date")
    public Calendar getDate() {
        return getProperty(DATE);
    }

    /** 
     * Get the introduction of the document.
     * @return the introduction
     */
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:introduction")
    public String getIntroduction() {
        return getProperty(INTRODUCTION);
    }

    /** 
     * Get the main content of the document.
     * @return the content
     */
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /** 
     * Get the location of the document.
     * @return the location
     */
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:location")
    public String getLocation() {
        return getProperty(LOCATION);
    }

    /** 
     * Get the author of the document.
     * @return the author
     */
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:author")
    public String getAuthor() {
        return getProperty(AUTHOR);
    }

    /** 
     * Get the source of the document.
     * @return the source
     */
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:source")
    public String getSource() {
        return getProperty(SOURCE);
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:image")
    public Imageset getImage() {
        return getLinkedBean("HippoCMSTest:image", Imageset.class);
    }
}
