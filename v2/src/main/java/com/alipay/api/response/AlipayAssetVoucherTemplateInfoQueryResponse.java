package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VcpFundInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.voucher.template.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-22 10:47:40
 */
public class AlipayAssetVoucherTemplateInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3562821541944179919L;

	/** 
	 * 券模版资产编码
	 */
	@ApiField("asset_code")
	private String assetCode;

	/** 
	 * 资金信息列表，其中fundType=FUND_SCHEME时fundAccount对应资金池id，其余情况对应出资账号
	 */
	@ApiListField("fund_infos")
	@ApiField("vcp_fund_info")
	private List<VcpFundInfo> fundInfos;

	/** 
	 * 券产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 券发放截止时间
	 */
	@ApiField("publish_end_time")
	private String publishEndTime;

	/** 
	 * 券发放起始时间
	 */
	@ApiField("publish_start_time")
	private String publishStartTime;

	/** 
	 * 券模版状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 券模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}
	public String getAssetCode( ) {
		return this.assetCode;
	}

	public void setFundInfos(List<VcpFundInfo> fundInfos) {
		this.fundInfos = fundInfos;
	}
	public List<VcpFundInfo> getFundInfos( ) {
		return this.fundInfos;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setPublishEndTime(String publishEndTime) {
		this.publishEndTime = publishEndTime;
	}
	public String getPublishEndTime( ) {
		return this.publishEndTime;
	}

	public void setPublishStartTime(String publishStartTime) {
		this.publishStartTime = publishStartTime;
	}
	public String getPublishStartTime( ) {
		return this.publishStartTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateName( ) {
		return this.templateName;
	}

}
