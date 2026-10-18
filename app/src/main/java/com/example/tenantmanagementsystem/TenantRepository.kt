package com.example.tenantmanagementsystem

// "object" = exactly one instance, shared by the whole app.
// Dashboard, Add Tenant and View Tenants all see the same list.
object TenantRepository {
    val tenants = mutableListOf<Tenant>()

    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    // Converts each rent to a number; invalid text counts as 0.0
    fun totalRent(): Double {
        return tenants.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }
    }
}