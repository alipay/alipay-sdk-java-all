package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询可绑定的商圈查询
 *
 * @author auto create
 * @since 1.0, 2023-06-12 16:12:02
 */
public class AlipayOpenSearchboxBusinessdistrictQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4823734747277128273L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 直达对应选择的官方账户应用ID
	 */
	@ApiListField("relate_appid_list")
	@ApiField("string")
	private List<String> relateAppidList;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public List<String> getRelateAppidList() {
		return this.relateAppidList;
	}
	public void setRelateAppidList(List<String> relateAppidList) {
		this.relateAppidList = relateAppidList;
	}

}
