package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.offline.material.image.upload response.
 *
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayOfflineMaterialImageUploadResponse extends AlipayResponse {

    private static final long serialVersionUID = 3483768475226323516L;

    /**
     * 图片/视频在商家中心的唯一标识
     */
    @ApiField("image_id")
    private String imageId;

    /**
     * 图片/视频的访问地址（为了防止盗链，该地址不允许嵌在其他页面展示，只能在新页面展示）
     */
    @ApiField("image_url")
    private String imageUrl;

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

}
