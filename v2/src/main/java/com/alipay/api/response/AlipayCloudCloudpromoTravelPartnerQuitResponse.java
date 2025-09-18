package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.travel.partner.quit response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-14 11:37:09
 */
public class AlipayCloudCloudpromoTravelPartnerQuitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1123619111853398295L;

	/** 
	 * 伴游状态
	 */
	@ApiField("assist_status")
	private String assistStatus;

	/** 
	 * 伴游记录ID
	 */
	@ApiField("item_id")
	private String itemId;

	public void setAssistStatus(String assistStatus) {
		this.assistStatus = assistStatus;
	}
	public String getAssistStatus( ) {
		return this.assistStatus;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

}
