package com.ztravel.product.back.freetravel.vo;

import java.util.List;

/**
 * @author wanhaofan
 * 成本数据VO
 * */
public class CostHotelMonthData {

	private List<CostHotelDayData> monthData ;

	private String month ;

	public List<CostHotelDayData> getMonthData() {
		return monthData;
	}

	public void setMonthData(List<CostHotelDayData> monthData) {
		this.monthData = monthData;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CostHotelMonthData other = (CostHotelMonthData) obj;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		return true;
	}

}
