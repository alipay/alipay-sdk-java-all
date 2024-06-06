package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店信息模型
 *
 * @author auto create
 * @since 1.0, 2023-10-13 10:25:00
 */
public class StoreInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5564113767146885224L;

	/**
	 * 商场付场景下的商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 外部门店编号
	 */
	@ApiField("real_store_id")
	private String realStoreId;

	/**
	 * 交易成功后命中改商圈下的门店id列表
	 */
	@ApiListField("real_store_id_list")
	@ApiField("string")
	private List<String> realStoreIdList;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getRealStoreId() {
		return this.realStoreId;
	}
	public void setRealStoreId(String realStoreId) {
		this.realStoreId = realStoreId;
	}

	public List<String> getRealStoreIdList() {
		return this.realStoreIdList;
	}
	public void setRealStoreIdList(List<String> realStoreIdList) {
		this.realStoreIdList = realStoreIdList;
	}

}
