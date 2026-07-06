package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ChipDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.poker.chip.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-17 16:57:37
 */
public class AntfortuneStockPokerChipSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5147988489546566882L;

	/** 
	 * 筹码详情
	 */
	@ApiField("chip")
	private ChipDTO chip;

	public void setChip(ChipDTO chip) {
		this.chip = chip;
	}
	public ChipDTO getChip( ) {
		return this.chip;
	}

}
