package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户维度券置顶接口
 *
 * @author auto create
 * @since 1.0, 2017-10-17 22:16:26
 */
public class KoubeiRetailInstanceTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2386267121747561577L;

	/**
	 * 置顶的券id列表信息，id的顺序指定置顶的券的顺序，如果空表示将原先的id删除。列表数量限制为20
	 */
	@ApiListField("instance_id_list")
	@ApiField("string")
	private List<String> instanceIdList;

	/**
	 * 券或者电子DM单（VOUCHER、DM），如果字段为空默认为VOUCHER类型
	 */
	@ApiField("instance_type")
	private String instanceType;

	public List<String> getInstanceIdList() {
		return this.instanceIdList;
	}
	public void setInstanceIdList(List<String> instanceIdList) {
		this.instanceIdList = instanceIdList;
	}

	public String getInstanceType() {
		return this.instanceType;
	}
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

}
