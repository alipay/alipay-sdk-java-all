package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务动态信息
 *
 * @author auto create
 * @since 1.0, 2019-10-28 20:33:22
 */
public class FsServiceDynamicInfo extends AlipayObject {

	private static final long serialVersionUID = 4539843718879211632L;

	/**
	 * 内容键 subjectData：主体数据
	 */
	@ApiField("content_key")
	private String contentKey;

	/**
	 * 数据类型； YIELD_TYPE：收益率，SUM：累计次数，CHANGE：涨跌幅，PRICE：价格，GOLD_PRICE：黄金价格，PROBABILITY：概率
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 内容值
	 */
	@ApiField("content_value")
	private String contentValue;

	/**
	 * 终止有效期（含）
	 */
	@ApiField("end_valid_date")
	private String endValidDate;

	/**
	 * 数据其实有效期（含）
	 */
	@ApiField("start_valid_date")
	private String startValidDate;

	public String getContentKey() {
		return this.contentKey;
	}
	public void setContentKey(String contentKey) {
		this.contentKey = contentKey;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentValue() {
		return this.contentValue;
	}
	public void setContentValue(String contentValue) {
		this.contentValue = contentValue;
	}

	public String getEndValidDate() {
		return this.endValidDate;
	}
	public void setEndValidDate(String endValidDate) {
		this.endValidDate = endValidDate;
	}

	public String getStartValidDate() {
		return this.startValidDate;
	}
	public void setStartValidDate(String startValidDate) {
		this.startValidDate = startValidDate;
	}

}
