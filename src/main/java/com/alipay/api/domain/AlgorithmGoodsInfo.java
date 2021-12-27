package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视觉货柜商品信息
 *
 * @author auto create
 * @since 1.0, 2019-12-02 14:16:57
 */
public class AlgorithmGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 7886475245293318967L;

	/**
	 * 算法商品Id
	 */
	@ApiField("algorithm_goods_id")
	private String algorithmGoodsId;

	/**
	 * gif文件Id
	 */
	@ApiField("gif_file_id")
	private String gifFileId;

	/**
	 * 图片文件Id
	 */
	@ApiField("pic_file_id")
	private String picFileId;

	/**
	 * 商品三维(单位mm*mm*mm)
	 */
	@ApiField("three_dimension")
	private String threeDimension;

	/**
	 * 缩略图fileId表，json
	 */
	@ApiField("thumbnails")
	private String thumbnails;

	public String getAlgorithmGoodsId() {
		return this.algorithmGoodsId;
	}
	public void setAlgorithmGoodsId(String algorithmGoodsId) {
		this.algorithmGoodsId = algorithmGoodsId;
	}

	public String getGifFileId() {
		return this.gifFileId;
	}
	public void setGifFileId(String gifFileId) {
		this.gifFileId = gifFileId;
	}

	public String getPicFileId() {
		return this.picFileId;
	}
	public void setPicFileId(String picFileId) {
		this.picFileId = picFileId;
	}

	public String getThreeDimension() {
		return this.threeDimension;
	}
	public void setThreeDimension(String threeDimension) {
		this.threeDimension = threeDimension;
	}

	public String getThumbnails() {
		return this.thumbnails;
	}
	public void setThumbnails(String thumbnails) {
		this.thumbnails = thumbnails;
	}

}
