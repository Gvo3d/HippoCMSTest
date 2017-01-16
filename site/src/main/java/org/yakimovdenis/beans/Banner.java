package org.yakimovdenis.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.yakimovdenis.beans.Imageset;

@HippoEssentialsGenerated(internalName = "HippoCMSTest:bannerdocument")
@Node(jcrType = "HippoCMSTest:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:title")
    public String getTitle() {
        return getProperty("HippoCMSTest:title");
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:content")
    public HippoHtml getContent() {
        return getHippoHtml("HippoCMSTest:content");
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:link")
    public HippoBean getLink() {
        return getLinkedBean("HippoCMSTest:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:image")
    public Imageset getImage() {
        return getLinkedBean("HippoCMSTest:image", Imageset.class);
    }
}
