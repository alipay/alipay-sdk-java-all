package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 比赛赔率选项
 *
 * @author auto create
 * @since 1.0, 2020-10-28 19:14:52
 */
public class MarketOddsSelection extends AlipayObject {

	private static final long serialVersionUID = 3811546461415799973L;

	/**
	 * 不同玩法含义不一样

胜平负
  1: 主胜
  0: 平
  -1: 客胜
首个进球
  1: 主进球
  0: 都未进球
  -1: 客进球
	 */
	@ApiField("code")
	private String code;

	/**
	 * 赔率
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 结果
1: 赢
0.5: 半赢（预留）
0: 退款
-0.5: 半输（预留）
-1: 输
	 */
	@ApiField("result")
	private Long result;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getResult() {
		return this.result;
	}
	public void setResult(Long result) {
		this.result = result;
	}

}
