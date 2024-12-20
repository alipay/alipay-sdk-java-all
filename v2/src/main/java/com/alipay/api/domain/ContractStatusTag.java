package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约状态标签
 *
 * @author auto create
 * @since 1.0, 2018-11-28 16:23:04
 */
public class ContractStatusTag extends AlipayObject {

	private static final long serialVersionUID = 4199141252731938255L;

	/**
	 * 合约标签码，在下列值中：
code - view - desc
EFFECTIVE - 守约中 - 加油,守约有助于积累信用哦
PENDING_PAY - 待支付 - 请及时返还优惠, 以免对你的信用造成影响哦
OVERDUE - 已逾期 - 请及时返还优惠, 以免对你的信用造成影响哦
PROMISED - 已守约 - 约定期内均可享受优惠哦
FINISHED - 已完成 - 服务约定已结束
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 合约标签码，在下列值中： code - view - desc EFFECTIVE - 守约中 - 加油,守约有助于积累信用哦 PENDING_PAY - 待支付 - 请及时返还优惠, 以免对你的信用造成影响哦 OVERDUE - 已逾期 - 请及时返还优惠, 以免对你的信用造成影响哦 PROMISED - 已守约 - 约定期内均可享受优惠哦 FINISHED - 已完成 - 服务约定已结束
	 */
	@ApiField("tag_desc")
	private String tagDesc;

	/**
	 * 合约标签码，在下列值中： code - view - desc EFFECTIVE - 守约中 - 加油,守约有助于积累信用哦 PENDING_PAY - 待支付 - 请及时返还优惠, 以免对你的信用造成影响哦 OVERDUE - 已逾期 - 请及时返还优惠, 以免对你的信用造成影响哦 PROMISED - 已守约 - 约定期内均可享受优惠哦 FINISHED - 已完成 - 服务约定已结束
	 */
	@ApiField("tag_view")
	private String tagView;

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagDesc() {
		return this.tagDesc;
	}
	public void setTagDesc(String tagDesc) {
		this.tagDesc = tagDesc;
	}

	public String getTagView() {
		return this.tagView;
	}
	public void setTagView(String tagView) {
		this.tagView = tagView;
	}

}
