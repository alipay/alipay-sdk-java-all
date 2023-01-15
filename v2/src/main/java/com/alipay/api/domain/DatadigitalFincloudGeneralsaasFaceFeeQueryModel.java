package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单据计费情况查询
 *
 * @author auto create
 * @since 1.0, 2023-01-13 17:16:24
 */
public class DatadigitalFincloudGeneralsaasFaceFeeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7762555426653666365L;

	/**
	 * 请传入certify_id列表。
	 */
	@ApiListField("certify_id_list")
	@ApiField("string")
	private List<String> certifyIdList;

	public List<String> getCertifyIdList() {
		return this.certifyIdList;
	}
	public void setCertifyIdList(List<String> certifyIdList) {
		this.certifyIdList = certifyIdList;
	}

}
