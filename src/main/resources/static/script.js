fetch('/companyInfo')
    .then(response => response.json())
    .then(data => {
        document.getElementById('aboutUsText').innerText = data.aboutUs;
        document.getElementById('contactUsText').innerText = data.contactUs;
        document.getElementById('technicalServicesText').innerText = data.technicalServices;
        document.getElementById('managedServicesText').innerText = data.managedServices;
        document.getElementById('peopleText').innerText = data.people;
        document.getElementById('consultancyText').innerText = data.consultancy;
    })
    .catch(error => console.error('Error fetching company info:', error));
