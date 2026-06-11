package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义藏品发放
 *
 * @author auto create
 * @since 1.0, 2026-04-14 16:22:45
 */
public class AnttechNftSkuCustomizeTransferModel extends AlipayObject {

	private static final long serialVersionUID = 5688158598679629885L;

	/**
	 * 活动ID
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 用户Id
	 */
	@ApiField("fans_id")
	private String fansId;

	/**
	 * 必填	OPEN_UID-鲸探OPEN_UID
PHONE_NO-手机号
	 */
	@ApiField("fans_id_type")
	private String fansIdType;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 资源文件Id
	 */
	@ApiField("source_file_id")
	private String sourceFileId;

	/**
	 * 贴图文件Id
	 */
	@ApiField("sticker_file_id")
	private String stickerFileId;

	/**
	 * 合作方交易唯一识别号
	 */
	@ApiField("third_biz_no")
	private String thirdBizNo;

	/**
	 * 缩略图文件Id
	 */
	@ApiField("thumbnail_file_id")
	private String thumbnailFileId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getFansId() {
		return this.fansId;
	}
	public void setFansId(String fansId) {
		this.fansId = fansId;
	}

	public String getFansIdType() {
		return this.fansIdType;
	}
	public void setFansIdType(String fansIdType) {
		this.fansIdType = fansIdType;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSourceFileId() {
		return this.sourceFileId;
	}
	public void setSourceFileId(String sourceFileId) {
		this.sourceFileId = sourceFileId;
	}

	public String getStickerFileId() {
		return this.stickerFileId;
	}
	public void setStickerFileId(String stickerFileId) {
		this.stickerFileId = stickerFileId;
	}

	public String getThirdBizNo() {
		return this.thirdBizNo;
	}
	public void setThirdBizNo(String thirdBizNo) {
		this.thirdBizNo = thirdBizNo;
	}

	public String getThumbnailFileId() {
		return this.thumbnailFileId;
	}
	public void setThumbnailFileId(String thumbnailFileId) {
		this.thumbnailFileId = thumbnailFileId;
	}

}
