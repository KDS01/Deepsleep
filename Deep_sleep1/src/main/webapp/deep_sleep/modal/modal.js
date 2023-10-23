let provisos = [];
const modal = document.getElementById("modal");
const openModalBtn = document.getElementById("open-modal");
const closeModalBtn = document.getElementById("close-modal");
const modal2 = document.getElementById("modal2");
const openModalBtn2 = document.getElementById("open-modal2");
const closeModalBtn2 = document.getElementById("close-modal2");
openModalBtn.onclick = (e) => {
  e.stopPropagation();
  modal.style.display = "block";
  document.body.style.overflow = "hidden";
};
closeModalBtn.onclick=() => {
  modal.style.display = "none";
  document.body.style.overflow = "auto";
};
openModalBtn2.onclick = (e) => {
    e.stopPropagation();
    modal2.style.display = "block";
    document.body.style.overflow = "hidden";
  };
  closeModalBtn2.onclick=() => {
    modal2.style.display = "none";
    document.body.style.overflow = "auto";
  };
document.getElementById('proviso_list').innerHTML=provisos;