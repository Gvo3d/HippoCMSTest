package org.yakimovdenis.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "HippoCMSTest:imageset")
@Node(jcrType = "HippoCMSTest:imageset")
public class Imageset extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "HippoCMSTest:small")
    public HippoGalleryImageBean getSmall() {
        return getBean("HippoCMSTest:small", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:large")
    public HippoGalleryImageBean getLarge() {
        return getBean("HippoCMSTest:large", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:smallsquare")
    public HippoGalleryImageBean getSmallsquare() {
        return getBean("HippoCMSTest:smallsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:mediumsquare")
    public HippoGalleryImageBean getMediumsquare() {
        return getBean("HippoCMSTest:mediumsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:largesquare")
    public HippoGalleryImageBean getLargesquare() {
        return getBean("HippoCMSTest:largesquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "HippoCMSTest:banner")
    public HippoGalleryImageBean getBanner() {
        return getBean("HippoCMSTest:banner", HippoGalleryImageBean.class);
    }
}
