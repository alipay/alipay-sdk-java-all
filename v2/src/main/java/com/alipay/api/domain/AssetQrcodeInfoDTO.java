package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC&码值信息列表，查询无结果时返回空数组
 *
 * @author auto create
 * @since 1.0, 2026-08-13 13:56:51
 */
public class AssetQrcodeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4435733513962214252L;

	/**
	 * 新空码绑码时关联的AO申请单号
	 */
	@ApiField("bind_apply_order_id")
	private String bindApplyOrderId;

	/**
	 * 新空码绑码时关联的指令ID
	 */
	@ApiField("bind_assign_item_id")
	private String bindAssignItemId;

	/**
	 * 码的业务编码，标识码的业务分类
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务主单据编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 码的业务类型，标识码的类型分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 物料项ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料项名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * nfc 链接
	 */
	@ApiField("nfc_url")
	private String nfcUrl;

	/**
	 * 码值
	 */
	@ApiField("qrcode")
	private String qrcode;

	/**
	 * 码值图片的URL地址，用于展示码值的图片资源。
	 */
	@ApiField("qrcode_img_url")
	private String qrcodeImgUrl;

	/**
	 * 码值URL
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	/**
	 * 业务子单据编号
	 */
	@ApiField("sub_biz_no")
	private String subBizNo;

	/**
	 * 线圈平台物料的tagId标识，用于关联线圈平台的物料信息。
	 */
	@ApiField("tag_id")
	private String tagId;

	public String getBindApplyOrderId() {
		return this.bindApplyOrderId;
	}
	public void setBindApplyOrderId(String bindApplyOrderId) {
		this.bindApplyOrderId = bindApplyOrderId;
	}

	public String getBindAssignItemId() {
		return this.bindAssignItemId;
	}
	public void setBindAssignItemId(String bindAssignItemId) {
		this.bindAssignItemId = bindAssignItemId;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(String nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

	public String getQrcode() {
		return this.qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public String getQrcodeImgUrl() {
		return this.qrcodeImgUrl;
	}
	public void setQrcodeImgUrl(String qrcodeImgUrl) {
		this.qrcodeImgUrl = qrcodeImgUrl;
	}

	public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

	public String getSubBizNo() {
		return this.subBizNo;
	}
	public void setSubBizNo(String subBizNo) {
		this.subBizNo = subBizNo;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

}
