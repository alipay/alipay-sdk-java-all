package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 碰开放扫码交易批量上报
 *
 * @author auto create
 * @since 1.0, 2026-10-12 11:27:59
 */
public class AlipayCommerceOperationScantradeReportBatchsendModel extends AlipayObject {

	private static final long serialVersionUID = 1212669914367415746L;

	/**
	 * 场景编码，碰开放扫码交易：PENG_OPEN_SCAN
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * null
	 */
	@ApiListField("trade_list")
	@ApiField("scan_trade_item")
	private List<ScanTradeItem> tradeList;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public List<ScanTradeItem> getTradeList() {
		return this.tradeList;
	}
	public void setTradeList(List<ScanTradeItem> tradeList) {
		this.tradeList = tradeList;
	}

}
