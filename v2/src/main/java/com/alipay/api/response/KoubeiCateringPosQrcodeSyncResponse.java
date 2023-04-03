package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.qrcode.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 12:07:33
 */
public class KoubeiCateringPosQrcodeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4498157519565177642L;

	/** 
	 * 桌台ID
	 */
	@ApiListField("desk_ids")
	@ApiField("string")
	private List<String> deskIds;

	public void setDeskIds(List<String> deskIds) {
		this.deskIds = deskIds;
	}
	public List<String> getDeskIds( ) {
		return this.deskIds;
	}

}
