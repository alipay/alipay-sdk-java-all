package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健身会员手机号同步
 *
 * @author auto create
 * @since 1.0, 2019-07-31 16:05:22
 */
public class KoubeiServindustryExerciseMemberphoneSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4755218914696735556L;

	/**
	 * 存量健身会员手机号
	 */
	@ApiListField("phone_list")
	@ApiField("string")
	private List<String> phoneList;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	public List<String> getPhoneList() {
		return this.phoneList;
	}
	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
