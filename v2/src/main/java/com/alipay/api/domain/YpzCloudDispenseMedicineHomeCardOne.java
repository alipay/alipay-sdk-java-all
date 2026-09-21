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
public class YpzCloudDispenseMedicineHomeCardOne extends AlipayObject {

	private static final long serialVersionUID = 7548417942886183126L;

	/**
	 * 按钮文案
	 */
	@ApiField("button_text")
	private String buttonText;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 主标题
	 */
	@ApiField("main_title")
	private String mainTitle;

	/**
	 * null
	 */
	@ApiListField("node_list")
	@ApiField("ypz_cloud_dispense_medicine_card_node")
	private List<YpzCloudDispenseMedicineCardNode> nodeList;

	/**
	 * 按钮跳转URL
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 标题
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

	public String getMainTitle() {
		return this.mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
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
