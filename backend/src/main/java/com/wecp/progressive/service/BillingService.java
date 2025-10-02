package com.wecp.progressive.service;

import com.wecp.progressive.entity.Billing;

import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Service;
@Service
=======
>>>>>>> b7e5e459680b0677906f6463d29e0cfa34b74fbc
public interface BillingService {

    List<Billing> getAllBills();

    Billing getBillById(int billingId);

    Integer createBill(Billing billing);

    void deleteBill(int billingId);

    List<Billing> getBillsByPatientId(int patientId);
<<<<<<< HEAD
}
=======
}
>>>>>>> b7e5e459680b0677906f6463d29e0cfa34b74fbc
