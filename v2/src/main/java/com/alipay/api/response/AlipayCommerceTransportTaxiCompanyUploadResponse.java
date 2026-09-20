package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ImportFailItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.company.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 10:51:07
 */
public class AlipayCommerceTransportTaxiCompanyUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4177484147531764642L;

	/** 
	 * 导入失败条数
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * null
	 */
	@ApiListField("fail_items")
	@ApiField("import_fail_item")
	private List<ImportFailItem> failItems;

	/** 
	 * 成功导入数量
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setFailItems(List<ImportFailItem> failItems) {
		this.failItems = failItems;
	}
	public List<ImportFailItem> getFailItems( ) {
		return this.failItems;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
