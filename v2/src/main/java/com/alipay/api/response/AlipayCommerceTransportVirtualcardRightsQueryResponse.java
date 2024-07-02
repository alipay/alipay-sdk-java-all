package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.virtualcard.rights.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:01:56
 */
public class AlipayCommerceTransportVirtualcardRightsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6357782833887379448L;

	/** 
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 支付宝分配的卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 权益数据
	 */
	@ApiField("right_data")
	private String rightData;

	/** 
	 * 权益类型
	 */
	@ApiListField("right_type_list")
	@ApiField("string")
	private List<String> rightTypeList;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setRightData(String rightData) {
		this.rightData = rightData;
	}
	public String getRightData( ) {
		return this.rightData;
	}

	public void setRightTypeList(List<String> rightTypeList) {
		this.rightTypeList = rightTypeList;
	}
	public List<String> getRightTypeList( ) {
		return this.rightTypeList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
