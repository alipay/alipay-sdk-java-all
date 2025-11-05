package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.sku.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:07:41
 */
public class AlipayOpenSpNcoilopenSkuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1826685819265484888L;

	/** 
	 * 是否有桌号
	 */
	@ApiField("need_desk_no")
	private Boolean needDeskNo;

	/** 
	 * 是否有点位名称
	 */
	@ApiField("need_point_name")
	private Boolean needPointName;

	/** 
	 * 需要二维码
	 */
	@ApiField("need_qr_code_link")
	private Boolean needQrCodeLink;

	/** 
	 * sku唯一标识
	 */
	@ApiField("sku_id")
	private String skuId;

	/** 
	 * 行业解决方案id，solution_id需要由具体业务方提供，联系产品获取
	 */
	@ApiField("solution_id")
	private String solutionId;

	/** 
	 * ntouch模板code
	 */
	@ApiField("template_code")
	private String templateCode;

	public void setNeedDeskNo(Boolean needDeskNo) {
		this.needDeskNo = needDeskNo;
	}
	public Boolean getNeedDeskNo( ) {
		return this.needDeskNo;
	}

	public void setNeedPointName(Boolean needPointName) {
		this.needPointName = needPointName;
	}
	public Boolean getNeedPointName( ) {
		return this.needPointName;
	}

	public void setNeedQrCodeLink(Boolean needQrCodeLink) {
		this.needQrCodeLink = needQrCodeLink;
	}
	public Boolean getNeedQrCodeLink( ) {
		return this.needQrCodeLink;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuId( ) {
		return this.skuId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionId( ) {
		return this.solutionId;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateCode( ) {
		return this.templateCode;
	}

}
