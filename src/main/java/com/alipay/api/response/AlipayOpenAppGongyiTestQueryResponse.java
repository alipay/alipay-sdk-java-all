package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayGongyiAddressTest;
import com.alipay.api.domain.OuterShopDO;
import com.alipay.api.domain.AlipayGongyiModelTest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.gongyi.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-10 10:14:01
 */
public class AlipayOpenAppGongyiTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7158468429698462748L;

	/** 
	 * 日期
	 */
	@ApiField("createdate")
	private Date createdate;

	/** 
	 * 测试测试测试测试测试
	 */
	@ApiField("shopaddress")
	private AlipayGongyiAddressTest shopaddress;

	/** 
	 * 商铺信息
	 */
	@ApiField("shopinfo")
	private OuterShopDO shopinfo;

	/** 
	 * 店铺名称
	 */
	@ApiField("shopname")
	private String shopname;

	/** 
	 * 测试测试测试
	 */
	@ApiField("shoprecord")
	private AlipayGongyiModelTest shoprecord;

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Date getCreatedate( ) {
		return this.createdate;
	}

	public void setShopaddress(AlipayGongyiAddressTest shopaddress) {
		this.shopaddress = shopaddress;
	}
	public AlipayGongyiAddressTest getShopaddress( ) {
		return this.shopaddress;
	}

	public void setShopinfo(OuterShopDO shopinfo) {
		this.shopinfo = shopinfo;
	}
	public OuterShopDO getShopinfo( ) {
		return this.shopinfo;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopname( ) {
		return this.shopname;
	}

	public void setShoprecord(AlipayGongyiModelTest shoprecord) {
		this.shoprecord = shoprecord;
	}
	public AlipayGongyiModelTest getShoprecord( ) {
		return this.shoprecord;
	}

}
