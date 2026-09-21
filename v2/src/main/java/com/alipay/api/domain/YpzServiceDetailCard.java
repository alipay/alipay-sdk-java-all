package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-17 14:27:55
 */
public class YpzServiceDetailCard extends AlipayObject {

	private static final long serialVersionUID = 2217147776932719789L;

	/**
	 * 主按钮文案
	 */
	@ApiField("button_text")
	private String buttonText;

	/**
	 * 左按钮文案
	 */
	@ApiField("button_text_left")
	private String buttonTextLeft;

	/**
	 * 右按钮文案
	 */
	@ApiField("button_text_right")
	private String buttonTextRight;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 卡描述(副标题)
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展属性
	 */
	@ApiField("ext")
	private YpzServiceDetailCardExt ext;

	/**
	 * 图片url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * null
	 */
	@ApiListField("node_list")
	@ApiField("ypz_cloud_dispense_medicine_card_node")
	private List<YpzCloudDispenseMedicineCardNode> nodeList;

	/**
	 * 主按钮跳转地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 左按钮跳转地址
	 */
	@ApiField("redirect_url_left")
	private String redirectUrlLeft;

	/**
	 * 右按钮跳转地址
	 */
	@ApiField("redirect_url_right")
	private String redirectUrlRight;

	/**
	 * 卡状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 卡状态文案
	 */
	@ApiField("status_text")
	private String statusText;

	/**
	 * 卡标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 唯一id
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getButtonText() {
		return this.buttonText;
	}
	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getButtonTextLeft() {
		return this.buttonTextLeft;
	}
	public void setButtonTextLeft(String buttonTextLeft) {
		this.buttonTextLeft = buttonTextLeft;
	}

	public String getButtonTextRight() {
		return this.buttonTextRight;
	}
	public void setButtonTextRight(String buttonTextRight) {
		this.buttonTextRight = buttonTextRight;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public YpzServiceDetailCardExt getExt() {
		return this.ext;
	}
	public void setExt(YpzServiceDetailCardExt ext) {
		this.ext = ext;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<YpzCloudDispenseMedicineCardNode> getNodeList() {
		return this.nodeList;
	}
	public void setNodeList(List<YpzCloudDispenseMedicineCardNode> nodeList) {
		this.nodeList = nodeList;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getRedirectUrlLeft() {
		return this.redirectUrlLeft;
	}
	public void setRedirectUrlLeft(String redirectUrlLeft) {
		this.redirectUrlLeft = redirectUrlLeft;
	}

	public String getRedirectUrlRight() {
		return this.redirectUrlRight;
	}
	public void setRedirectUrlRight(String redirectUrlRight) {
		this.redirectUrlRight = redirectUrlRight;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusText() {
		return this.statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
