package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户券码券上传
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:39:37
 */
public class AlipayMarketingVoucherStockCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2861445739881798468L;

	/**
	 * 券码列表，商户体系内可兑换使用的券码
	 */
	@ApiListField("entity_list")
	@ApiField("string")
	private List<String> entityList;

	/**
	 * 外部单据号, 请保持唯一, 如果重复则认为重复请求, 可以使用uuid生成或使用商户自己的单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 库存ID, 首次创建请填写空, 追加库存请填原始库存ID
	 */
	@ApiField("stock_id")
	private String stockId;

	public List<String> getEntityList() {
		return this.entityList;
	}
	public void setEntityList(List<String> entityList) {
		this.entityList = entityList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStockId() {
		return this.stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

}
