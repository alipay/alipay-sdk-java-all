package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预览协议
 *
 * @author auto create
 * @since 1.0, 2020-09-29 23:05:55
 */
public class AlipayBossProdProtocolOrderPreviewModel extends AlipayObject {

	private static final long serialVersionUID = 8316598847284775272L;

	/**
	 * 签约账号
	 */
	@ApiListField("card_nos")
	@ApiField("string")
	private List<String> cardNos;

	/**
	 * 商户联系人信息
	 */
	@ApiField("contact_info")
	private ContactInfomation contactInfo;

	/**
	 * 是否需要包含个性化价格协议
	 */
	@ApiField("include_custom_protocol")
	private Boolean includeCustomProtocol;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_info")
	private MerchantInformation merchantInfo;

	/**
	 * 是否需要文件
	 */
	@ApiField("need_file")
	private Boolean needFile;

	/**
	 * 是否需要填充协议模板动态内容（如需要，签约账号，商户信息，联系人信息需要传递）
	 */
	@ApiField("need_fill_item")
	private Boolean needFillItem;

	/**
	 * 是否返回html
	 */
	@ApiField("need_html")
	private Boolean needHtml;

	/**
	 * 销售方案
	 */
	@ApiField("sale_plans")
	private SalePlanInfo salePlans;

	/**
	 * 系统来源，不填默认为主站
	 */
	@ApiField("source")
	private String source;

	public List<String> getCardNos() {
		return this.cardNos;
	}
	public void setCardNos(List<String> cardNos) {
		this.cardNos = cardNos;
	}

	public ContactInfomation getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ContactInfomation contactInfo) {
		this.contactInfo = contactInfo;
	}

	public Boolean getIncludeCustomProtocol() {
		return this.includeCustomProtocol;
	}
	public void setIncludeCustomProtocol(Boolean includeCustomProtocol) {
		this.includeCustomProtocol = includeCustomProtocol;
	}

	public MerchantInformation getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(MerchantInformation merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public Boolean getNeedFile() {
		return this.needFile;
	}
	public void setNeedFile(Boolean needFile) {
		this.needFile = needFile;
	}

	public Boolean getNeedFillItem() {
		return this.needFillItem;
	}
	public void setNeedFillItem(Boolean needFillItem) {
		this.needFillItem = needFillItem;
	}

	public Boolean getNeedHtml() {
		return this.needHtml;
	}
	public void setNeedHtml(Boolean needHtml) {
		this.needHtml = needHtml;
	}

	public SalePlanInfo getSalePlans() {
		return this.salePlans;
	}
	public void setSalePlans(SalePlanInfo salePlans) {
		this.salePlans = salePlans;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
