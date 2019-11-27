package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告渠道绑定查询
 *
 * @author auto create
 * @since 1.0, 2017-07-05 14:34:26
 */
public class KoubeiAdvertCommissionAdvchannelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2162619919429628314L;

	/**
	 * 广告ID
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 当前页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 每页记录数，默认10，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
