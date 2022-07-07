package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点位实时状态
 *
 * @author auto create
 * @since 1.0, 2019-11-20 11:47:07
 */
public class EntityStatus extends AlipayObject {

	private static final long serialVersionUID = 1273157776113985573L;

	/**
	 * 安卓是否可借
	 */
	@ApiField("android_can_borrow")
	private Boolean androidCanBorrow;

	/**
	 * 安卓可借用个数
	 */
	@ApiField("android_can_borrow_cnt")
	private String androidCanBorrowCnt;

	/**
	 * 是否可借
	 */
	@ApiField("can_borrow")
	private Boolean canBorrow;

	/**
	 * 可借用个数
	 */
	@ApiField("can_borrow_cnt")
	private String canBorrowCnt;

	/**
	 * 是否可还 true,false,null(未知)
	 */
	@ApiField("can_restore")
	private Boolean canRestore;

	/**
	 * 可还个数(可空),null表示未知,0表示可还0
	 */
	@ApiField("can_restore_cnt")
	private String canRestoreCnt;

	/**
	 * 苹果是否可借
	 */
	@ApiField("ios_can_borrow")
	private Boolean iosCanBorrow;

	/**
	 * 苹果可借用个数
	 */
	@ApiField("ios_can_borrow_cnt")
	private String iosCanBorrowCnt;

	/**
	 * 当前是否开业(比如节假日或者临时有事,在固定的营业时间内,但是商户临时歇业了)
	 */
	@ApiField("is_opening")
	private Boolean isOpening;

	/**
	 * typec是否可借
	 */
	@ApiField("typec_can_borrow")
	private Boolean typecCanBorrow;

	/**
	 * typec可借用个数
	 */
	@ApiField("typec_can_borrow_cnt")
	private String typecCanBorrowCnt;

	public Boolean getAndroidCanBorrow() {
		return this.androidCanBorrow;
	}
	public void setAndroidCanBorrow(Boolean androidCanBorrow) {
		this.androidCanBorrow = androidCanBorrow;
	}

	public String getAndroidCanBorrowCnt() {
		return this.androidCanBorrowCnt;
	}
	public void setAndroidCanBorrowCnt(String androidCanBorrowCnt) {
		this.androidCanBorrowCnt = androidCanBorrowCnt;
	}

	public Boolean getCanBorrow() {
		return this.canBorrow;
	}
	public void setCanBorrow(Boolean canBorrow) {
		this.canBorrow = canBorrow;
	}

	public String getCanBorrowCnt() {
		return this.canBorrowCnt;
	}
	public void setCanBorrowCnt(String canBorrowCnt) {
		this.canBorrowCnt = canBorrowCnt;
	}

	public Boolean getCanRestore() {
		return this.canRestore;
	}
	public void setCanRestore(Boolean canRestore) {
		this.canRestore = canRestore;
	}

	public String getCanRestoreCnt() {
		return this.canRestoreCnt;
	}
	public void setCanRestoreCnt(String canRestoreCnt) {
		this.canRestoreCnt = canRestoreCnt;
	}

	public Boolean getIosCanBorrow() {
		return this.iosCanBorrow;
	}
	public void setIosCanBorrow(Boolean iosCanBorrow) {
		this.iosCanBorrow = iosCanBorrow;
	}

	public String getIosCanBorrowCnt() {
		return this.iosCanBorrowCnt;
	}
	public void setIosCanBorrowCnt(String iosCanBorrowCnt) {
		this.iosCanBorrowCnt = iosCanBorrowCnt;
	}

	public Boolean getIsOpening() {
		return this.isOpening;
	}
	public void setIsOpening(Boolean isOpening) {
		this.isOpening = isOpening;
	}

	public Boolean getTypecCanBorrow() {
		return this.typecCanBorrow;
	}
	public void setTypecCanBorrow(Boolean typecCanBorrow) {
		this.typecCanBorrow = typecCanBorrow;
	}

	public String getTypecCanBorrowCnt() {
		return this.typecCanBorrowCnt;
	}
	public void setTypecCanBorrowCnt(String typecCanBorrowCnt) {
		this.typecCanBorrowCnt = typecCanBorrowCnt;
	}

}
