package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员信息修改
 *
 * @author auto create
 * @since 1.0, 2018-09-25 15:59:40
 */
public class KoubeiMarketingMallMemberModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5414996726142573432L;

	/**
	 * 需要修改的最新卡信息
	 */
	@ApiField("card_info")
	private MallCardUpdate cardInfo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public MallCardUpdate getCardInfo() {
		return this.cardInfo;
	}
	public void setCardInfo(MallCardUpdate cardInfo) {
		this.cardInfo = cardInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
