package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RedPocketInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.pocketmoney.redpacket.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-19 17:27:20
 */
public class AlipayPayAppPocketmoneyRedpacketBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4658741976386413277L;

	/** 
	 * 红包详情list
	 */
	@ApiListField("red_pocket_list")
	@ApiField("red_pocket_info")
	private List<RedPocketInfo> redPocketList;

	public void setRedPocketList(List<RedPocketInfo> redPocketList) {
		this.redPocketList = redPocketList;
	}
	public List<RedPocketInfo> getRedPocketList( ) {
		return this.redPocketList;
	}

}
