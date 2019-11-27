package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 库存信息
 *
 * @author auto create
 * @since 1.0, 2019-03-25 11:02:21
 */
public class ShopBookInventory extends AlipayObject {

	private static final long serialVersionUID = 6334375377937573499L;

	/**
	 * 可预订日期。标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("book_date")
	private Date bookDate;

	/**
	 * 单日库存信息
	 */
	@ApiListField("book_inventory")
	@ApiField("shop_book_inventory_daily")
	private List<ShopBookInventoryDaily> bookInventory;

	public Date getBookDate() {
		return this.bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public List<ShopBookInventoryDaily> getBookInventory() {
		return this.bookInventory;
	}
	public void setBookInventory(List<ShopBookInventoryDaily> bookInventory) {
		this.bookInventory = bookInventory;
	}

}
