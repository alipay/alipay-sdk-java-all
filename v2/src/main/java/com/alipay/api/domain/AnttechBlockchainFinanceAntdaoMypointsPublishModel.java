package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝费率查询
 *
 * @author auto create
 * @since 1.0, 2020-07-03 13:21:13
 */
public class AnttechBlockchainFinanceAntdaoMypointsPublishModel extends AlipayObject {

	private static final long serialVersionUID = 8273137376443852366L;

	/**
	 * 数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 方法路由
	 */
	@ApiField("method_name")
	private String methodName;

	/**
	 * 商品ID
	 */
	@ApiField("sku_id")
	private String skuId;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMethodName() {
		return this.methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
