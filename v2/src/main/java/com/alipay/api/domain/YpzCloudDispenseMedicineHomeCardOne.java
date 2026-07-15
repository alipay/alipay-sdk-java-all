package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-07 14:32:58
 */
public class YpzCloudDispenseMedicineHomeCardOne extends AlipayObject {

	private static final long serialVersionUID = 7694526388982745821L;

	/**
	 * 按钮文案
	 */
	@ApiField("button_text")
	private String buttonText;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

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

	public String getButtonText() {
		return this.buttonText;
	}
	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
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

}
