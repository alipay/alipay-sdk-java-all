package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.service.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:17:51
 */
public class AlipayIserviceCcmServiceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5436468935129964949L;

	/** 
	 * spi在ccm中的唯一标识，与biz_code一一对应
	 */
	@ApiListField("spi_ids")
	@ApiField("spi_result")
	private List<SpiResult> spiIds;

	public void setSpiIds(List<SpiResult> spiIds) {
		this.spiIds = spiIds;
	}
	public List<SpiResult> getSpiIds( ) {
		return this.spiIds;
	}

}
