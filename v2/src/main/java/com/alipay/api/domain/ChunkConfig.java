package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 切分配置
 *
 * @author auto create
 * @since 1.0, 2025-08-22 10:35:07
 */
public class ChunkConfig extends AlipayObject {

	private static final long serialVersionUID = 4135916442398726731L;

	/**
	 * 分段长度，单位tokens
	 */
	@ApiField("length")
	private Long length;

	/**
	 * 分段重叠长度,单位tokens
	 */
	@ApiField("overlap")
	private Long overlap;

	/**
	 * 切分策略
	 */
	@ApiField("strategy")
	private String strategy;

	/**
	 * 切分标识符
	 */
	@ApiListField("symbols")
	@ApiField("string")
	private List<String> symbols;

	public Long getLength() {
		return this.length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	public Long getOverlap() {
		return this.overlap;
	}
	public void setOverlap(Long overlap) {
		this.overlap = overlap;
	}

	public String getStrategy() {
		return this.strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public List<String> getSymbols() {
		return this.symbols;
	}
	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

}
