package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询检查检验标品详情接口
 *
 * @author auto create
 * @since 1.0, 2026-05-20 21:02:50
 */
public class AlipayCommerceMedicalExaminationCspudetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2541436871952584495L;

	/**
	 * null
	 */
	@ApiListField("spu_id_list")
	@ApiField("string")
	private List<String> spuIdList;

	public List<String> getSpuIdList() {
		return this.spuIdList;
	}
	public void setSpuIdList(List<String> spuIdList) {
		this.spuIdList = spuIdList;
	}

}
